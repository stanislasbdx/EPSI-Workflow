"use strict";
const examDiv = document.getElementById("exam-div");
const hwTitle = document.getElementsByTagName("h1")[0];
const bodyStyle = document.body.style;
bodyStyle.background = "black";
examDiv.style.width = "450px";
examDiv.style.height = "450px";
examDiv.style.margin = "auto";
examDiv.style.background = "white";
hwTitle.style.textAlign = "center";
hwTitle.style.fontFamily = "Helvetica";
function clickDiv() {
    const divBgColor = bodyStyle.background;
    if (divBgColor === "black") {
        bodyStyle.background = "white";
        examDiv.style.background = "black";
        hwTitle.style.color = "white";
    }
    else if (divBgColor === "white") {
        bodyStyle.background = "black";
        examDiv.style.background = "white";
        hwTitle.style.color = "black";
    }
}
