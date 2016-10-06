package com.prices;

public abstract class Prizes
{
	int count;
	
	abstract String getPrizeName();
	
	abstract short totalNumbersOfPrizes(byte total);	
}
