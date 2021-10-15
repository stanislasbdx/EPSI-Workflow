/**
 * Gestion des phrases douces et gentilles
 */

// On récupère les éléments bouton et le paragraphe
var sweetSentenceElement = document.getElementById("sweetSentenceElement");
var sweetSentenceBtn = document.getElementById("sweetSentenceBtn");

const sweetSentences = [
	"Il n’y a pas de clés pour le bonheur, la porte est toujours ouverte",
	"Fais toujours de ton mieux, même si personne ne regarde",
	"Il y a des fleurs partout pour qui veut bien les voir.",
	"La vie, c’est comme une bicyclette, il faut avancer pour ne pas perdre l’équilibre.",
	"N'oublie pas de briller !",
	"Salut, c'est Stan 🥔.",
	"Sourire mobilise 15 muscles, mais faire la gueule en sollicite 40. Reposez-vous : souriez !",
	"Là où il y a une volonté, il y a un chemin.",
	"Il n'y a pas de honte à préférer le bonheur.",
	"Un seul moment de joie chasse cent moments de tristesse.",
	"Les gagnants trouvent des moyens, les perdants des excuses.",
	"N'attendez pas d'être heureux pour sourire, souriez plutôt afin d'être heureux.",
	"Fais n'importe quoi, mais tires-en de la joie.",
	"Un voyage de mille lieues commence toujours par un premier pas.",
	"L’échec est seulement l’opportunité de recommencer d’une façon plus intelligente.",
	"Il faut viser la lune, parce qu’au moins si vous échouez, vous finissez dans les étoiles.",
	"Les gagnants trouvent des moyens, les perdants des excuses."
]

// Si le bouton enregistre un clic, alors on modifie le HTML du paragraphe pour le remplacer par une phrase aléatoire dans notre array
sweetSentenceBtn.onclick = function () {
	sweetSentenceElement.innerHTML = sweetSentences[Math.floor(Math.random() * sweetSentences.length)];
}

/**
 * Gestion de la date
 */

/**
 * @name print0InParams
 * @description Cette fonction à pour but de rajouter ou non un 0 pour avoir un affichage propre sur la date et l'heure
 * 
 * @param {Number} param
 * @returns {String}
 */
function print0InParams(param) {
	if (param > -1 && param < 10) return "0" + param;
	else return param;
}

/**
 * @name printDateTime
 * @description Cette fonction à pour d'afficher l'heure sur les éléments possédants l'id 'printdatetime'
 * 
 * @returns {void}
 */
function printDateTime() {
	let currentDate = document.getElementById('printdatetime');
	let current = new Date();
	currentDate.innerHTML = `${print0InParams(current.getDate())}/${print0InParams(current.getMonth())}/${current.getFullYear()} et il est ${current.getHours()}:${print0InParams(current.getMinutes())}:${print0InParams(current.getSeconds())}`;
}

setInterval(printDateTime, 1000);