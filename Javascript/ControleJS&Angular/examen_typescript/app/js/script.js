"use strict";
/*
? Partie: 1 : JS
const examDiv = document.getElementById("exam-div")! as HTMLElement;
const hwTitle = document.getElementsByTagName("h1")[0]! as HTMLElement;
const bodyStyle = document.body.style;

bodyStyle.background = "black";

examDiv.style.width = "450px";
examDiv.style.height = "450px";
examDiv.style.margin = "auto";
examDiv.style.background = "white";

hwTitle.style.textAlign = "center";
hwTitle.style.fontFamily = "Helvetica";*/
/*
    ? Partie 2 :

    function clickDiv() {
    const divBgColor = bodyStyle.background;

    if (divBgColor === "black") {
        bodyStyle.background = "white";
        examDiv.style.background = "black";
        hwTitle.style.color = "white";
    } else if (divBgColor === "white") {
        bodyStyle.background = "black";
        examDiv.style.background = "white";
        hwTitle.style.color = "black";
    }
}*/
/*
? Partie 2.5: Event JS
function clickDiv() {
    const divBgColor = bodyStyle.background;

    invertColors(divBgColor);
}*/
/**
 * Invert colors from a previous one
 * @param prevColor Previous color used
 */
/*
? Partie 4: Programmation Fonctionnelle
function invertColors(prevColor: string) {
    const newColor = prevColor === "white" ? "black" : "white";

    bodyStyle.background = newColor;
    examDiv.style.background = prevColor;
    hwTitle.style.color = newColor;
}*/
class Page {
    constructor() {
        this._div = document.getElementById("exam-div");
        this._title = document.getElementsByTagName("h1")[0];
        this._body = document.body;
        this._body.style.background = "black";
        this._title.style.textAlign = "center";
        this._title.style.fontFamily = "Helvetica";
        this._title.style.background = "white";
        this._div.style.width = "450px";
        this._div.style.height = "450px";
        this._div.style.margin = "auto";
        this._div.style.background = "white";
        this._div.addEventListener("click", () => {
            this.InvertColors(this._body);
            this.InvertColors(this._div);
            this.InvertColors(this._title);
        });
    }
    InvertColors(el) {
        el.style.background = el.style.background === "white" ? "black" : "white";
        el.style.color = el.style.background === "white" ? "black" : "white";
    }
}
new Page();
