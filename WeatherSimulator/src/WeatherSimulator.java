//Jake Chang

import java.util.Random;

public class WeatherSimulator
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        //Initialize variables
        int day = 1;
        String status = "Clear";
        String event = "";

        /* Print "7 day weather forecast" */
        System.out.println("7 day weather forecast");

        //Simulation runs for 7 days
        while (day <= 7)
        {
            //Each day has 5 event changes
            for (int i = 1; i <= 5; i++)
            {
                //Determine which event will occur
                int eventNum = rand.nextInt(3);

                //Change status based on event
                if (eventNum == 0)
                {
                    if (status.equals("Clear"))
                    {
                        status = "Cloudy";
                        event = "Getting Warmer";
                    } else if (status.equals("Cloudy"))
                    {
                        status = "Raining";
                        event = "Getting Colder";
                    } else if (status.equals("Raining"))
                    {
                        status = "Severe Weather";
                        event = "Humidity is Increasing";
                    } else if (status.equals("Severe Weather"))
                    {
                        status = "Clear";
                        event = "Wind is Increasing";
                    }
                } else if (eventNum == 1)
                {
                    event = "No Change";
                } else if (eventNum == 2)
                {
                    if (status.equals("Clear"))
                    {
                        status = "Cloudy";
                        event = "Getting Warmer";
                    } else if (status.equals("Cloudy"))
                    {
                        status = "Raining";
                        event = "Getting Colder";
                    } else if (status.equals("Raining"))
                    {
                        status = "Severe Weather";
                        event = "Wind is Increasing";
                    } else if (status.equals("Severe Weather"))
                    {
                        status = "Clear";
                        event = "Humidity is Increasing";
                    }
                }
                //Print results for each event
                System.out.println("Day " + day + ": " + event);
            }
            //Increment day
            day++;
        }
    }
}