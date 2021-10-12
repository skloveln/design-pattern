import com.github.sky.AudioType;
import com.github.sky.MediaPlayerImpl;
import org.junit.Test;

/**
 * 描述：
 *
 * @author sukai
 * @date 2021/10/8
 */
public class JunitTest {

    @Test
    public void test(){
        MediaPlayerImpl adapter = new MediaPlayerImpl();
        adapter.play(AudioType.AVI, "file1.avi");
        adapter.play(AudioType.MP4, "file2.mp4");
        adapter.play(AudioType.MP3, "file3.mp3");
        adapter.play(AudioType.WMA, "file4.wma");
    }

}
