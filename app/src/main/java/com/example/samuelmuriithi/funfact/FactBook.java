package com.example.samuelmuriithi.funfact;

//THIS CLASS WILL TAKE THE RESPONSIBILITY OF SELECTING A RANDOM FACT
// FROM THE mFacts ARRAY AND RETURNING THE FACT (single responsibility)

import java.util.Random;

public class FactBook {
    //A class is an object, and an object has two main parts:
      /*
      1. FIELDS (Member variables) - properties about the object
      */
    String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic Gold Medals are actually mostly made of Silver",
            "You are born with 300 bones; by the time you are an adult, you will have 206.",
            "It takes about 8 minutes for light from the sun to reach the Earth.",
            "Some Bamboo plants can grow to a height of almost a metre in 24 hours.",
            "The state of Florida is bigger than England.",
            "Some penguins can jump 2-3 metres out of water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the Earth when the Great Pyramid was being built.",
            "The offspring of a Zebra and a donkey is called a Zebroid",
            "The miracle fruit when eaten makes bitter food taste sweet",
            "Rice is a staple food for more than half of the world's population",
            "A pumpkin is actually a fruit",
            "Pope John Paul II's body has never decayed up to date",
            "The first Apple computer was assembled in Steve Job's garage by Steve Wozniac",
            "During its discovery, Rabbis was know as Hydrophobia",
            "\"Love yourself\" was actually Ed Sheeran's own composure",
            "The triangle is the stongest shape found in nature",
            "Snow flakes have traces of diamond",
            "The FreeMasonry we know today actually started as a group of Architects",
            "You are amazing",
            "The largest waterfall is actually under water",
            "Bananas are curved because they grow towards the sun",
            "A flock of crows is known as a murder",
            "Cherophobia is an irrational fear of fun and happiness",
            "Heart attacks are more likely to occur on a Monday",
            "Polar bears could eat as many as 86 penguins in a single sitting",
            "Facebook, Istagram and Twitter are all banned in China",
            "Saint Lucia is the only country in the world named after a woman",
            "A sheep, a duck and a rooster were the first passengers on a hot air balloon",
            "30th of July is Friendship Day",
            "A small child could swim through the veins of a Blue Whale",
            "Pirates wore an earring because they believed it improved their eyesight",
            "The Twitter bird actually has a name - Larry",
            "It snowed in th Sahara Desert for 30 minutes on the 18th of February, 1979",
            "There has never been a verified Snow Leopard attack on a human being",
            "The first Alarm Clock could only ring at 4 AM",
            "There is officially a wizard of New Zealand",
            "An apple, potato and onion all taste the same if you eat them with your nose plugged",
            "An average person walks an equivalent of five times around the world in their lifetime",
            "According to Genesis 1:20-22, the Chicken came before the egg",
            "Honeybees can get drunk on fermented tree sap",
            "Tears contain a natural painkiller which relives pain and improves you mood",
            "Squirrels forget where they hide almost half of their nuts",
            "Strawberries can be red, green, white or yellow",
            "The smallest bone in your body is in your ear",
            "Captive pandas sometimes fake pregnancy",
            "There is a sea slug that is part animal, part plant",
            "The Common Cold comes from Camels",
            "Before 1913, you could legally mail a baby",
            "The original London Bridge is now in Arizona",
            "Kit Harrington is related to the man who invented the flush toilet",
            "Hawaiian Pizza is actually a Canadian Invention",
            "Every year, the Netherlands sends Canada 20,000 tulip bulbs",
            "Jupiter has a \"Lost Moon\"",
            "In Japan, girls buy boys gifts on Valentine's day",
            "The word \"Disaster\" means \"Bad star\" in Ancient Greek",
            "Eating carrots can turn you skin orange",
            "Volkswagen car manufacturer make more profit from selling sausages",
            "Lobsters have teeth in their stomachs",
            "Cats don't naturally meow",
            "Nearly 3% of the ice in Antarctic glaciers is penguin urine"
    };
     /*
      2. METHODS - Actions that the object can take
      */
      public String getFact() {

          String fact = "";

          //Create a new Random object with a variable name: "randomGenerator"
          //Random is a class provided by java that helps us create all sorts of random numbers
          Random randomGenerator = new Random();
          //Then we create an integer variable called "randomNumber" to store the generated random number as such:
          int randomNumber = randomGenerator.nextInt(mFacts.length);
          //Randomly select a fact using the random number to refer to the indices of the facts in the array
          fact = mFacts[randomNumber];

          //A method/function always returns something
          return fact;
      }

}
