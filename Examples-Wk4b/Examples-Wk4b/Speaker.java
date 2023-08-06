public class Speaker {
    enum SpeakerType {MONO, STEREO};

    String model;
    SpeakerType type;

    public Speaker(String model, SpeakerType type){
        this.model = model;
        this.type = type;
    }
}