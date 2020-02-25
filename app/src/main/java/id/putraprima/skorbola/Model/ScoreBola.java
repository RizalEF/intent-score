package id.putraprima.skorbola.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class ScoreBola implements Parcelable {
    public String homeTeam;
    public String awayTeam;

    public ScoreBola(String homeTeam, String awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    protected ScoreBola(Parcel in) {
        homeTeam = in.readString();
        awayTeam = in.readString();
    }

    public static final Creator<ScoreBola> CREATOR = new Creator<ScoreBola>() {
        @Override
        public ScoreBola createFromParcel(Parcel in) {
            return new ScoreBola(in);
        }

        @Override
        public ScoreBola[] newArray(int size) {
            return new ScoreBola[size];
        }
    };

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(homeTeam);
        dest.writeString(awayTeam);
    }
}
