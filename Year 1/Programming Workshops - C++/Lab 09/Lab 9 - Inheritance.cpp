/**
 * @author      Dakota Hill (100523538)
 * @version     1.0
 * @since       2014-03-26
 */

#include "stdafx.h"
#include <iostream>
#include <string>

using namespace std;

/**
 * The base class for superheroes or villains
 */
class Hero {
friend class Avenger;
friend class Mutant;

protected:
    string name;				 // The hero's name
  public:
    void set_name (string title); // Sets the name of the hero 
	int PowerLevel;	// The power level of any given hero (average)
	void OutName();
};

void Hero::OutName() {
	cout << name;
}

void Hero::set_name(string title) { // Uses the input as the hero's name
	name = title;
}

/**
 * The derived class dealing with mutants
 */
class Mutant : public Hero {
friend class Hero;

public:
	void set_name (string title)	
      {Hero::set_name(title);}		//Sends the input to the Hero function of the same name
	  bool MorX;
 };

/**
 * A second derived class for avengers
 */
class Avenger : public Hero {
friend class Hero;

public:
	void set_name (string title)
	{Hero::set_name(title);}		//Sends the input to the Hero function of the same name
    
	string SecretIdentity;			// The human name of the Avenger
 };

/**
 * A function for mutants to determine whether they work for Magneto or Xavier
 * @param YorN a bool for either Professor X or Magneto
 */
bool MorX(bool YorN) {
	if (YorN = false) {
	cout <<  "Xavier";
		return "Xavier";
	}
	else if (YorN = true) {
	cout << "Magneto";
	return "Magneto";
	}
};

int _tmain(int argc, _TCHAR* argv[])
{
	Avenger h1;
	Avenger h2;
	Mutant h3;
	Mutant h4;
	Avenger h5;

	h1.set_name("Spider-Man");
	h1.PowerLevel = 4;
	h1.SecretIdentity = "Peter Parker";

	h2.set_name("Iron Man");
	h2.PowerLevel = 6;
	h2.SecretIdentity = "Tony Stark";

	h3.set_name("Wolverine");
	h3.PowerLevel = 4;
	h3.MorX = false;

	h4.set_name("Magneto");
	h4.PowerLevel = 5;
	h4.MorX = true;

	h5.set_name("Wolverine");
	h5.PowerLevel = 4;
	h5.SecretIdentity = "Logan";

	h1.OutName();
	cout << " has a power level of " << h1.PowerLevel << " and his secret identity is " << h1.SecretIdentity << endl;
	
	h2.OutName();
	cout << " has a power level of " << h2.PowerLevel << " and his secret identity is " << h2.SecretIdentity << endl;
	
	h3.OutName();
	cout << " has a power level of " << h3.PowerLevel << " and works for " << MorX(h3.MorX) << endl;
 
	h4.OutName();	
	cout << " has a power level of " << h4.PowerLevel << " and works for " << MorX(h4.MorX) << endl;
	
	h5.OutName();
	cout << " has a power level of " << h5.PowerLevel << " and his secret identity is " << h5.SecretIdentity << endl;
	
	return 0;
}

