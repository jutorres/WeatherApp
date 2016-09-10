package service;

import data.Channel;

/**
 * Created by jtorres on 9/9/16.
 */
public interface WeatherServiceCallback {
    void serviceSuccess(Channel channel);

    void serviceFailure(Exception exception);
}
