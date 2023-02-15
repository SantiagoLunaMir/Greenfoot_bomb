import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bear extends Actor
{
    /**
     * Act - do whatever the Bear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int offsetX=5;
    int offsetY=5;
    private static int nextOffset=5;;
    public Bear(){
        offsetX=nextOffset;
        offsetY=nextOffset;
        nextOffset +=3;
    }
    public void act()
    {
        int x = getX();
        int y = getY();
        
        setLocation(offsetX+x,offsetY+y);
        if(getY()>=380 || getY()<=0){
            offsetY *=-1;
            //addObject(bomb,getX(),getY());
        }
        
        if(getX()>=575 ||getX()<=0){
            offsetX *=-1;
        }
        Turle turle = (Turle)getOneIntersectingObject(Turle.class);
        if(turle!=null){
            World world=getWorld();
            //world.removeObject(turle);
            bomba bomb = new bomba();
            world.addObject(bomb,getX(),getY());
        }
    }
}
