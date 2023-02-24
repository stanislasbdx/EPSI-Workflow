"use strict";

const examDiv = document.getElementById("exam-div")! as HTMLElement;
const hwTitle = document.getElementsByTagName("h1")[0]! as HTMLElement;
const bodyStyle = document.body.style;

bodyStyle.background = "black";

examDiv.style.width = "450px";
examDiv.style.height = "450px";
examDiv.style.margin = "auto";
examDiv.style.background = "white";

hwTitle.style.textAlign = "center";
hwTitle.style.fontFamily = "Helvetica";

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

function clickDiv() {
	const divBgColor = bodyStyle.background;

	invertColors(divBgColor);
}

/**
 * Invert colors from a previous one
 * @param prevColor Previous color used
 */
function invertColors(prevColor: string) {
	const newColor = prevColor === "white" ? "black" : "white";

	bodyStyle.background = newColor;
	examDiv.style.background = prevColor;
	hwTitle.style.color = newColor;
}