package com.javaexercises;

import java.util.Arrays;

public class ComparableInterfaceEx implements Comparable<ComparableInterfaceEx> {

	
	private String imie;
	private String nazwisko;
	private int nrAlbumu;
	
	public ComparableInterfaceEx(String imie, String nazwisko, int nrAlbumu) {
		// TODO Auto-generated constructor stub
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.nrAlbumu = nrAlbumu;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // tworzymy tablicê studentów o rozmiarze 6
		ComparableInterfaceEx[] studenci = new ComparableInterfaceEx[6];

		  // wype³niamy poszczególne elementy tablicy obiektami typu Student
		  studenci[0] = new ComparableInterfaceEx("Marek", "Zielony", 4325);
		  studenci[1] = new ComparableInterfaceEx("Jacek", "Mruczek", 7453);
		  studenci[2] = new ComparableInterfaceEx("Iwona", "Lonkis", 2644);
		  studenci[3] = new ComparableInterfaceEx("Marta", "Annas", 1632);
		  studenci[4] = new ComparableInterfaceEx("Adam", "Mruczek", 3856);
		  studenci[5] = new ComparableInterfaceEx("Marek", "Zielony", 4287);

		  // sortujemy tablicê za pomoc¹ metody sort dostêpnej w klasie Arrays
		  // elementy tablicy zostan¹ posortowane wed³ug metody compareTo()
		  Arrays.sort(studenci);

		  // wyœwietlamy zawartoœæ posortowanej tablicy
		  for (ComparableInterfaceEx st: studenci){
		   System.out.println(st);
		  }
		 }

	public String toString(){
		
		return this.imie +" "+ this.nazwisko +" "+ this.nrAlbumu;
	}
	

	@Override
	public int compareTo(ComparableInterfaceEx obiekt) {
		// je¿eli nazwiska s¹ takie same
		if (nazwisko.compareTo(obiekt.nazwisko) == 0)
		// sprawdzamy imiona
		if(imie.compareTo(obiekt.imie) == 0)
		// jeœli s¹ takie same zwracamy ró¿nicê z numerów albumu (dla takich samych bêdzie to zero)
		return nrAlbumu - obiekt.nrAlbumu;
		else
		// w przeciwnym wypadku zwracamy porównanie imion
		return imie.compareTo(obiekt.imie);
		else
		// w przeciwnym wypadku zwracamy porównanie nazwisk
		return nazwisko.compareTo(obiekt.nazwisko);
		}


}
