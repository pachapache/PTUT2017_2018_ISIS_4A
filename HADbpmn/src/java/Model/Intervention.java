package Model;

public class Intervention {
    
    private String name;
    private String typeActor;
    private int duration;
    private UnityTime unityDuration;
    private int frequency;
    private UnityTime unityFrequency;
    private TimeDay timeDay;
    private HomeCareStructure homeCareStructure;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeActor() {
        return typeActor;
    }

    public void setTypeActor(String typeActor) {
        this.typeActor = typeActor;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public UnityTime getUnityDuration() {
        return unityDuration;
    }

    public void setUnityDuration(UnityTime unityDuration) {
        this.unityDuration = unityDuration;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public UnityTime getUnityFrequency() {
        return unityFrequency;
    }

    public void setUnityFrequency(UnityTime unityFrequency) {
        this.unityFrequency = unityFrequency;
    }

    public TimeDay getTimeDay() {
        return timeDay;
    }

    public void setTimeDay(TimeDay timeDay) {
        this.timeDay = timeDay;
    }

    public HomeCareStructure getHomeCareStructure() {
        return homeCareStructure;
    }

    public void setHomeCareStructure(HomeCareStructure homeCareStructure) {
        this.homeCareStructure = homeCareStructure;
    }

    public Intervention(String name, String typeActor, int duration, UnityTime unityDuration, int frequency, UnityTime unityFrequency, TimeDay timeDay, HomeCareStructure homeCareStructure) {
        this.name = name;
        this.typeActor = typeActor;
        this.duration = duration;
        this.unityDuration = unityDuration;
        this.frequency = frequency;
        this.unityFrequency = unityFrequency;
        this.timeDay = timeDay;
        this.homeCareStructure = homeCareStructure;
    }

                    
    
    
}
