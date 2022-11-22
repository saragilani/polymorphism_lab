package Vehicle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TrainTest {

    private Train testTrain;

    @BeforeEach
    public void setTestTrain(){
        testTrain = new Train(500, 20, 5, "Wolverhampton");

    }

    @Test
    public void canBeepHorn(){
        //Arrange
        String expected = "CHOO! CHOO!";
        //Act
        String actual = testTrain.beepHorn();
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void canMakeAnnouncement(){
        //Arrange
        String expected = "This train will split at Northampton. " +
                "Those headed to Wolverhampton should move to carriages 3 and below.";
        //Act
        String actual = testTrain.makeAnnouncement();
        //Assert
        assertEquals(expected, actual);
    }

}
