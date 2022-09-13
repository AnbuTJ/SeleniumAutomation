package Day01;
public class speaker implements Volume, Power,Play{


    @Override
    public void play() {
        System.out.println("Play the music");
    }

    @Override
    public void pause() {
        System.out.println("Pause the music");

    }

    @Override
    public void volumeUp() {
        System.out.println("Volume is increased");

    }

    @Override
    public void volumeDown() {
        System.out.println("Volume is decreased");
    }

    @Override
    public void mute() {
        System.out.println("Mute the music");
    }

    @Override
    public void powerOn() {
        System.out.println("Turn poweron");
    }

    @Override
    public void powerOff() {
        System.out.println("Turn poweroff");
    }
}
