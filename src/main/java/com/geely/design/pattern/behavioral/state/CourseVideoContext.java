package com.geely.design.pattern.behavioral.state;

/**
 * 描述:
 *
 * @author xvanning
 * @create 2020-06-07 18:28
 */
public class CourseVideoContext {
    private CourseVideoState courseVideoState;
    public static final PlayState PLAY_STATE = new PlayState();
    public static final PauseState PAUSE_STATE = new PauseState();
    public static final SpeedState SPEED_STATE = new SpeedState();
    public static final StopState STOP_STATE = new StopState();

    public CourseVideoState getCourseVideoState() {
        return courseVideoState;
    }

    public void setCourseVideoState(CourseVideoState courseVideoState) {
        this.courseVideoState = courseVideoState;
        this.courseVideoState.setCourseVideoContext(this);
    }

    public void play() {
        this.courseVideoState.play();
    }

    public void pause() {
        this.courseVideoState.pause();
    }

    public void speed() {
        this.courseVideoState.speed();
    }

    public void stop() {
        this.courseVideoState.stop();
    }

}