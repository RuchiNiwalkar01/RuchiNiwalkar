!function(e){var t={};function n(o){if(t[o])return t[o].exports;var i=t[o]={i:o,l:!1,exports:{}};return e[o].call(i.exports,i,i.exports,n),i.l=!0,i.exports}n.m=e,n.c=t,n.d=function(e,t,o){n.o(e,t)||Object.defineProperty(e,t,{enumerable:!0,get:o})},n.r=function(e){"undefined"!=typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})},n.t=function(e,t){if(1&t&&(e=n(e)),8&t)return e;if(4&t&&"object"==typeof e&&e&&e.__esModule)return e;var o=Object.create(null);if(n.r(o),Object.defineProperty(o,"default",{enumerable:!0,value:e}),2&t&&"string"!=typeof e)for(var i in e)n.d(o,i,function(t){return e[t]}.bind(null,i));return o},n.n=function(e){var t=e&&e.__esModule?function(){return e.default}:function(){return e};return n.d(t,"a",t),t},n.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},n.p="",n(n.s=0)}([function(e,t){function n(e,t,n){this.element=e,this.dragStart=t,this.dragDrop=n,this.element.className="draggable";var o=this;this.element.addEventListener("mousedown",function(e){console.log(e.type),console.log(e.currentTarget),void 0!==o.dragStart&&o.dragStart();var t=parseInt(window.getComputedStyle(this).left),n=parseInt(window.getComputedStyle(this).top),i=(parseInt(window.getComputedStyle(this).right),e.clientX),r=e.clientY;function d(e){o.element.style.left=t+e.clientX-i+"px",o.element.style.top=n+e.clientY-r+"px"}document.addEventListener("mousemove",d,!0),document.addEventListener("mouseup",function e(t){document.removeEventListener("mousemove",d,!0),document.removeEventListener("mouseup",e,!0),void 0!==o.dragDrop&&o.dragDrop()},!0)},!1)}window.onload=function(){var e=document.getElementById("editor");document.getElementById("addBtn").addEventListener("click",function(){let t=document.createElement("div");t.setAttribute("id","texteditor"),t.setAttribute("contenteditable","true"),e.appendChild(t);new MediumEditor(t);new n(t);function o(e){t.style.width=e.clientX-t.offsetLeft+"px",t.style.height=e.clientY-t.offsetTop+"px"}function i(e){window.removeEventListener("mousemove",o,!1),window.removeEventListener("mouseup",i,!1)}t.className="resizer",t.style.position="absolute",t.addEventListener("dblclick",function(e){window.addEventListener("mousemove",o,!1),window.addEventListener("mouseup",i,!1)},!1)}),document.getElementById("browse").addEventListener("change",function(){var t=document.querySelector("input[type=file]").files,o=document.createElement("div");o.setAttribute("id","image"),t&&[].forEach.call(t,function(t){if(/\.(jpe?g|png|gif)$/i.test(t.name)){var i=new FileReader;i.addEventListener("load",function(){var i=new Image;i.height=100,i.title=t.name,i.src=this.result,o.appendChild(i),e.appendChild(o);new n(o);function r(e){i.style.width=e.clientX-i.offsetLeft+"px",i.style.height=e.clientY-i.offsetTop+"px"}function d(e){window.removeEventListener("mousemove",r,!1),window.removeEventListener("mouseup",d,!1)}i.addEventListener("dblclick",function(e){window.addEventListener("mousemove",r,!1),window.addEventListener("mouseup",d,!1)},!1)},!1),i.readAsDataURL(t)}})})}}]);