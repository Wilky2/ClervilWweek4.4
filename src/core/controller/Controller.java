package core.controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import core.model.SingletonSquare;
import core.model.Tools;
import core.model.arrayList.ListArray;
import core.model.channelList.ChannelList;
import core.view.Read;
import core.view.Show;

public class Controller {

	private Read read;
	ListArray<Object> a;
	ChannelList l;

	public Controller() {
		read = new Read();
		l = new ChannelList();
		a = new ListArray<Object>();
	}

	public void run() {
		int choice;
		Show.menu();

		try {
			choice = read.readInt();

			switch (choice) {
			case 1: {
				l.clear();
				Show.display("Entrer le nombre element de la liste");
				int nb = read.readInt();
				for(int i = 0; i<nb;i++) {
					Show.display("Entrer l'element " + (i+1));
					l.addTail(read.readString());
				}
				Show.display("liste avant inversement");
				Show.display(l.toString());
				Show.display("liste apres inversement");
				l.reverse();
				Show.display(l.toString());
			}
				break;

			case 2: {
				Show.display("Entrer le nombre element");
				int nb = read.readInt();
				
				List<Double> n = new ArrayList<Double>();
				for(int i = 0; i<nb;i++) {
					Show.display("Entrer l'element " + (i+1));
					n.add(read.readDouble());
				}
				Show.display("Le nombre de doublon est : " + Tools.findDuplicate(n));
			}
				break;

			case 3: {
				Show.display("Entrer le nombre element");
				int nb = read.readInt();
				
				List<Double> n = new ArrayList<Double>();
				for(int i = 0; i<nb;i++) {
					Show.display("Entrer l'element " + (i+1));
					n.add(read.readDouble());
				}
				int m = Tools.findMediumEqualIndex(n);  
				if(m!=-1) {
					Show.display("La position du millieu est : " + m);
				}
				else {
					Show.display("Le millieu n'existe pas");
				}
			}
				break;

			case 4: {
				Show.display("Notre classe est un carre");
				Show.display("Entrer le cote du carre");
				SingletonSquare.square.setCote(read.readInt());
				Show.display("Le perimetre de ce carre est :" + SingletonSquare.square.perimeter());
				Show.display("La surface de ce carre est :" + SingletonSquare.square.surface());
			}
				break;

			case 5: {
				Show.display("Entre le mot a inverser");
				String word = read.readString();
				Show.display("Mot avant inversement : ");
				Show.display(word);
				Show.display("Mot apres inversement : ");
				Show.display(Tools.reverseString(word));
			}
				break;

			case 6: {
				Show.display("Entre le nombre a inverser");
				int nb = read.readInt();
				Show.display("Nombre avant inversement : ");
				Show.display(nb+"");
				Show.display("Nombre apres inversement : ");
				Show.display(Tools.reverseNumber(nb)+"");
			}
				break;

			case 7: {
				Show.display("Entre le nombre a convertir");
				int nb = read.readInt();
				Show.display(nb + " = " + Tools.binary(nb));
			}
				break;

			case 8: {
				Show.display("Entre le nombre");
				int nb = read.readInt();
				if(Tools.isPerfectNumber(nb)) {
					Show.display("C'est un nombre parfait");
				}
				else {
					Show.display("Ce n'est un nombre parfait");
				}
			}
				break;

			case 9: {
				Show.display("Entrer le nombre element");
				int nb = read.readInt();
				
				ListArray<String> s = new ListArray<String>();
				for(int i = 0; i<nb;i++) {
					Show.display("Entrer l'element " + (i+1));
					s.add(read.readString());
				}
				Show.display(s.toString());
			}
				break;

			case 10: {
				Show.display("Entre le path du fichier");
				Show.display("Le nombre de mot dupliquer dans le fichier est : " + Tools.doubleWordInFile(read.readString()));
			}
				break;

			}
		} catch (InputMismatchException e) {
			Show.display("Mauvais choix");
			read.readNextLine();
		}
		catch(IndexOutOfBoundsException e) {
			Show.display("Mauvais choix");
			read.readNextLine();
		}
		
		Show.display("Presser 1 pour continuer");
		String s = read.readString();
		if(s.equals("1")) {
			run();
		}
	}

}
