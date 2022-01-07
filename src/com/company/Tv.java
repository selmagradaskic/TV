package com.company;

public class Tv {
    private int channel = 1;
    private int volume = 1;
    private boolean onOf = false;

    public Tv() {

    }

    public Tv(int channel, int volume, boolean onOf) {
        this.channel = channel;
        this.onOf = onOf;
        this.volume = volume;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isOnOf() {
        return onOf;
    }

    public void setOnOf(boolean onOf) {
        this.onOf = onOf;
    }

    public void turnOn() {
        onOf = true;
    }

    public void turnOf() {
        onOf = false;
    }

    public void changeChannel(int newChannel) {
        if (onOf=true && newChannel>=1 && newChannel<=50) {
            channel = newChannel;
        }
    }

    public void changeVolume(int newVolume) {
        if (onOf = true && newVolume>=1 && newVolume<=10) {
            volume = newVolume;
        }
    }

    public void channelUp() {
        if (onOf = true && channel < 50) {
            channel++;
        }
    }

    public void channelDown() {
        if (onOf = true && channel>1) {
            channel--;
        }
    }

    public void volumeUp(){
        if (onOf = true && volume<10) {
            volume++;
        }
    }

    public void volumeDown() {
        if (onOf = true && volume>1) {
            volume--;
        }
    }


    @Override
    public String toString() {
        return "Tv{" +
                "channel=" + channel +
                ", volume=" + volume +
                ", onOf=" + onOf +
                '}';
    }
}
