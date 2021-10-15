/**
 * Gestion des bulles en background avec jQuery
 */

// On récupère grâce à jQuery l'élément qui possède la classe 'bubbles'
var $bubbles = $('.bubbles');

function bubbles() {
	const bubble_amount = [20, 60]; // Quantité de bulles
	const bubble_size = [8, 24]; // Taille des bulles

	// Calcul du nombre de bulles
	var bubbleCount = bubble_amount[0] + Math.floor(Math.random() * (bubble_amount[1] + 1));

	// On ajoute toutes les bulles sur la page sous forme de classes
	for (var i = 0; i < bubbleCount; i++) {
		$bubbles.append('<div class="bubble-container"><div class="bubble"></div></div>');
	}

	// Pour chaque bulle...
	$bubbles.find('.bubble-container').each(function () {
		// ... on va générer les paramètres de la bulle de manière aléatoire
		var pos_rand = Math.floor(Math.random() * 101);
		var size_rand = bubble_size[0] + Math.floor(Math.random() * (bubble_size[1] + 1));
		var delay_rand = Math.floor(Math.random() * 16);
		var speed_rand = 8 + Math.floor(Math.random() * 9);
		var blur_rand = Math.floor(Math.random() * 3);

		// On modifie le CSS de la bulle et son enfant pour modifier sa taille et sa vitesse
		$(this).css({
			'left': pos_rand + '%',

			'-webkit-animation-duration': speed_rand + 's',
			'-moz-animation-duration': speed_rand + 's',
			'-ms-animation-duration': speed_rand + 's',
			'animation-duration': speed_rand + 's',

			'-webkit-animation-delay': delay_rand + 's',
			'-moz-animation-delay': delay_rand + 's',
			'-ms-animation-delay': delay_rand + 's',
			'animation-delay': delay_rand + 's',

			'-webkit-filter': 'blur(' + blur_rand + 'px)',
			'-moz-filter': 'blur(' + blur_rand + 'px)',
			'-ms-filter': 'blur(' + blur_rand + 'px)',
			'filter': 'blur(' + blur_rand + 'px)',
		});

		$(this).children('.bubble').css({
			'width': size_rand + 'px',
			'height': size_rand + 'px',
			'-moz-border-radius': size_rand + 'px',
			'-webkit-border-radius': size_rand + 'px',
			'border-radius': size_rand + 'px'
		});

	});
}

// On lance la fonction
bubbles();