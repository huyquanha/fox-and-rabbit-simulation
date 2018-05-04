import java.awt.Color;
/**
 * Write a description of class TextView here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextView implements SimulatorView
{
    private final String STEP_PREFIX = "Step: ";
    private final String POPULATION_PREFIX = "Population: ";
   
    private FieldStats stats;
    
    public void setColor(Class actorClass, Color color)
    {  
    }
   
    public boolean isViable(Field field)
    {
       return stats.isViable(field);
    }
   
    public void showStatus(int step,Field field)
    {
        stats.reset();
       
        for(int row = 0; row < field.getDepth(); row++) {
            for(int col = 0; col < field.getWidth(); col++) {
                Object animal = field.getObjectAt(row, col);
                if(animal != null) {
                    stats.incrementCount(animal.getClass());
                }
            }
        }
        
    }
   
    public void reset()
    {
       
    }
    
    
}
