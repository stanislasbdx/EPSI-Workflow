package initiation;

public class Typage {
	public static void main(String[] args) {
		short annee = -30000;

		byte nbClanMembers = 127;

		long nbChanceux = 8589934592L;

		String nomClan = "Pierre";

		char modifNom = 'e';

		boolean isFeuilleLetal = true;

		boolean isGrosseBrancheLetal = false;

		float eauEnPeauDeMammouth = 10.5F;

		double eauTotal = 1234567890123456789012345678901234567890.12345678901234567890;

		System.out.println("Nous somme en " + annee + " av. J.-C, mon nom est " + nomClan + modifNom + " et je suis un brillant scientifique (Mon nombre favori est " + nbChanceux + ", gros chiffre gros cerveau !)\nJe suis un des " + nbClanMembers + " membres du clan des " + nomClan + "\n\nMes recherches m'ont permis de découvrir que frapper quelqu’un avec une feuille d'arbre " + (isFeuilleLetal ? "est mortel" : "n'est pas mortel") + ".\nCependant le frapper avec une grosse branche du même arbre " + (isGrosseBrancheLetal ? "est mortel" : "n'est pas mortel") + "!\n\nJ'ai également calculé que notre réserve d'eau s'élève actuellement à exactement " + eauEnPeauDeMammouth + " PMP (Peau de Mammouth Pleine).\nJ'estime que la réserve de l'océan s'élève à environ " + eauTotal + " PMP ! \n\n" );
	}
}
