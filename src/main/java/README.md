## **Plants**



Plant is an abstract class. That contains 2 instance variables

    private Integer waterConsumption;
    private SunExposure sunExposure;
###### **SunExposure is an enum class
***
`Climb` contains a single method climb() which takes no paramaters and returns an Integer representing the how high the plant will climb on average.

    Integer climb();

`Bloom` contains a single method bloom() which takes no paramaters and returns an Integer representing the number of buds that have blossomed.

    Integer bloom();
    
***

Concrete classes are Cactus, Fern, Hibiscus, HoneySuckle, Ivy, and PearTree. All extend from plant.

`Cactus`

Implements Bloom and returns 1.
Add a Integer instance value to represent the number of needles. Add a getter and setter for it.

`Fern`

Does not implement anything additonal.

`Hibiscus`

Implements Bloom and returns 2.

`HoneySuckle`

Implements Bloom and Climb and returns 150 and 7 respectively.

`Ivy`

Implements Climb interface and returns 30;


`PearTree`

Implements Bloom and returns 500.