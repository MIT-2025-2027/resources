package td2_tp2.ex4;

import java.util.Date;

public class Chronometer implements IChronometer {
    private final static int INIT = 0;
    private final static int RUNNING = 1;
    private final static int STOPPED = 2;

    private int state;
    private Date lastStartDate;
    private long lastSumDelta;

    public Chronometer() {
        this.state = INIT;
        this.lastSumDelta = 0L;
    }

    @Override
    public void start() {
        switch (this.state) {
            case INIT:
                this.lastStartDate = new Date();
                this.state = RUNNING;
                break;
            case RUNNING:
                break;
            case STOPPED:
                this.lastStartDate = new Date();
                this.state = RUNNING;
                break;
        }

    }

    @Override
    public void stop() {
        switch (this.state) {
            case INIT:
                break;
            case RUNNING:
                this.lastSumDelta += new Date().getTime() - this.lastStartDate.getTime();
                this.state = STOPPED;
                break;
            case STOPPED:
                break;
        }
    }

    @Override
    public long getTime() {
        switch (this.state) {
            case INIT:
                return 0L;
            case RUNNING:
                return (this.lastSumDelta + (new Date().getTime() - this.lastStartDate.getTime()));
            case STOPPED:
                return this.lastSumDelta;
            default:
                return 0L;
        }
    }

    @Override
    public void raz() {
        switch (this.state) {
            case INIT:
                break;
            case RUNNING:
                this.state = INIT;
                this.lastSumDelta = 0;
                break;
            case STOPPED:
                this.state = INIT;
                this.lastSumDelta = 0;
                break;
        }
    }
}
