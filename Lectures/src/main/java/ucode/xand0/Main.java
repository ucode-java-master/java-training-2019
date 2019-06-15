package ucode.xand0;


/**
 * Sa se creeze o aplicatie pentru jocul X si 0. (vezi recording recording-problem-homework). Aplicatia trebuie sa citeasca de la tastatura linia si coloana
 * unde utilizatorul doreste sa puna un element, sa afiseze pe ecran matricea jocului si sa dea urmatoarele informatii: cine a castigat jocul (X sau 0) sau daca
 * se termina la egalitate.
 * <p>
 * Actiunile de baza ce trebuie indeplinite pentru a realiza aceasta aplicatie sunt: Afiseze pe ecran o matrice de 3x3 Citeasca, de la tastatura, urmatoarea
 * mutare a jucatorului. (linie, coloana, element) Sa nu poata suprascrie o informatie deja introdusa Aplicatia trebuie sa verifice conditia de victorie =>
 * Acelasi tip de element, pe oricare din linii sau coloane sau diagonala principala sau diagonala secundara. Egalitate: conditia de victorie nu este
 * indeplinita, nu mai sunt locuri libere in matrice. Conditia de victorie trebuie verificata la fiecare introducere de date.
 * <p>
 * Actiuni mai avansate ale aplicatiei sunt: Sa modificam cum introducem de la tastatura, sa introducem doar linia si coloana, iar x sau 0 sa se puna automat de
 * catre program, alternativ. Keep score.
 * <p>
 * Aplicatia va fi terminata pana in 27 mai. Va fi prezentata in timpul cursului, atat codul cat si cum functioneaza aplicatia.
 */
public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
    }

}
