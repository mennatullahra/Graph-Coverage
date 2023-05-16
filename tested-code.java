public int findTheFirstPrimeNumber(int startNumber, int endNumber)
	{
		if(startNumber > endNumber)
			return -1;
		if(startNumber < 2)
			return -1;
		for(int i = startNumber; i <= endNumber; i++)
		{
			if(i%2 == 0)
				continue;
			boolean isPrime = true;
			for(int j =2; j < i; j++)
			{
				if(i % j ==0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				return i;
		}
		return -1;
	}
