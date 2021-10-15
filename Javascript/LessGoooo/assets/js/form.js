// On récupère le bouton et on attends que l'utilisateur clique
const sendFormBtn = document.getElementById("sendFormBtn");
sendFormBtn.onclick = function () {
	checkForm();
}

function checkForm() {
	const emailValue = document.getElementById("emailInput").value;
	const messageValue = document.getElementById("messageInput").value;

	const errText = document.getElementById("errText");

	// On réinitialise les erreurs et le message d'erreur
	const err = [];
	errText.removeAttribute("class");

	// On vérifie l'email
	const res = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
	if (!res.test(String(emailValue).toLowerCase())) {
		err.push("L'email est invalide.");
	}

	// On vérifie le message
	if (messageValue.length == 0) {
		err.push("Vous n'avez pas écrit de message.");
	}
	else if (messageValue.length < 10) {
		err.push("Votre message est trop court. (10 charatères min)");
	}

	// Si des erreurs ont été ajoutées, on les affiche
	if (err.length > 0) {
		var errorMessage = "";

		err.forEach((msg) => {
			errorMessage += msg + "<br/>";
		});

		errText.innerHTML = errorMessage;

		errText.classList.add("text-color--warning");
	}
	// Sinon, on envoie le message
	else {
		errText.innerHTML = "Votre message à été envoyé !";

		errText.classList.add("text-color--success");
	}
}