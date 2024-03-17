package app;

import objects.PlayList;

import java.io.Serializable;
import java.util.List;

public class MusicBox extends App implements Serializable {
    public MusicBox(List<PlayList> playLists) {
        super(playLists);
    }
}
