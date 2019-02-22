

window.onload=function()
{
    var maindiv=document.getElementById("editor");
    document.getElementById("addBtn").addEventListener('click',addTextArea);
    function addTextArea()
    {
               let text= document.createElement("div");
               text.setAttribute("id" , "texteditor");
               text.setAttribute("contenteditable" , "true");
               
               maindiv.appendChild(text);
               let editor = new MediumEditor(text); 
               var dragObj = new Draggable(text);
    
               text.className = 'resizer';
               text.style.position = 'absolute';
               text.addEventListener('dblclick', initResize, false);
               function initResize(e) 
           {
               window.addEventListener('mousemove', Resize, false);
               window.addEventListener('mouseup', stopResize, false);
           }
           function Resize(e) 
           {
               text.style.width = (e.clientX - text.offsetLeft) + 'px';
               text.style.height = (e.clientY - text.offsetTop) + 'px';
    
               
           }
           function stopResize(e) 
           {
               window.removeEventListener('mousemove', Resize, false);
               window.removeEventListener('mouseup', stopResize, false);
           }
    }


    let a = document.getElementById('browse');
    a.addEventListener('change' , previewFiles);
    function previewFiles() 
    {
    
      
       var files   = document.querySelector('input[type=file]').files;
       var preview = document.createElement("div"); 
       preview.setAttribute("id" , "image");               
    
       function readAndPreview(file) {
    
       // Make sure `file.name` matches our extensions criteria
       if ( /\.(jpe?g|png|gif)$/i.test(file.name) ) {
           var reader = new FileReader();
    
           reader.addEventListener("load", function () {
           var image = new Image();
           image.height = 100;
           image.title = file.name;
           image.src = this.result;
           preview.appendChild(image);
           maindiv.appendChild(preview);
           var dragObj = new Draggable(preview);
           image.addEventListener('dblclick', initResize, false);
    
            function initResize(e) 
    {
        window.addEventListener('mousemove', Resize, false);
       window.addEventListener('mouseup', stopResize, false);
    }
    function Resize(e) 
    {
       image.style.width = (e.clientX - image.offsetLeft) + 'px';
       image.style.height = (e.clientY - image.offsetTop) + 'px';
    
        
    }
    function stopResize(e) 
    {
        window.removeEventListener('mousemove', Resize, false);
       window.removeEventListener('mouseup', stopResize, false);
    }
           
           
           }, false);
    
           reader.readAsDataURL(file);
       }
       
       }
    
       if (files) {
       [].forEach.call(files, readAndPreview);
       }
    
    }
}



function Draggable(element,dragStart,dragDrop)

{

               this.element=element;
               this.dragStart=dragStart;
               this.dragDrop=dragDrop;

               this.element.className = "draggable";
               
               //this.element.classlist.add("draggable");
               var self=this;

               var move = function(event)
               {
                       console.log(event.type);
                       console.log(event.currentTarget);

                       if(self.dragStart !==undefined)
                       {

                           self.dragStart();
                       }

                       //event.preventDefault();

                           var originalLeft= parseInt(window.getComputedStyle(this).left);
                           var originalTop= parseInt(window.getComputedStyle(this).top);
                           var originalRight= parseInt(window.getComputedStyle(this).right);

                           var mouseDownX = event.clientX;
                           var mouseDownY = event.clientY;

                       function dragMe(event)
                       {

                           self.element.style.left=originalLeft + event.clientX - mouseDownX + "px";
                           self.element.style.top=originalTop + event.clientY - mouseDownY + "px";

                           // self.element.style.right=originalRight + event.clientX - mouseDownX + "px";
                           // self.element.style.top=originalTop + event.clientY - mouseDownY + "px";

                       };

                       function dropMe(event)
                       {

                           document.removeEventListener('mousemove',dragMe,true);
                           document.removeEventListener('mouseup',dropMe,true);
                           if(self.dragDrop !==undefined)
                               {

                                   self.dragDrop();
                               }

                       };

                       document.addEventListener('mousemove',dragMe,true);
                       document.addEventListener('mouseup',dropMe,true);

               
               };


               this.element.addEventListener('mousedown',move,false);

               };

               var resizer= function(){

               this.element = "W=" + element.clientWidth + "H=" + element.clientHeight;

               };

               var dragStart= function (){

               this.element.style.width=parseInt(window,getComputedStyle(this.element).width) * 1.3 +"px";

               };

               var dragDrop= function (){

               window.addEventListener('resize',resizer,false);


}