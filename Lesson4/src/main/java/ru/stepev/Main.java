package ru.stepev;

        import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!!!");
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //Music music = context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer =context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName() + " " + musicPlayer.getVolume());
        System.out.println(musicPlayer.getDate() + " " + musicPlayer.getType());
        System.out.println(musicPlayer.getMusicList());

        context.close();

    }
}
