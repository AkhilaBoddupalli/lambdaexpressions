package com.stackroute.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo
{
    private String State;
    private String Capital;
    public StreamDemo(String State,String Capital){

        this.State = State;
        this.Capital = Capital;

}

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCapital() {
        return Capital;
    }

    public void setCapital(String capital) {
        Capital = capital;
    }

    @Override
    public String toString() {
        return "StreamDemo{" +
                "State='" + State + '\'' +
                ", Capital='" + Capital + '\'' +
                '}';
    }
}
    class LambdaDemo
    {
        public static void main(String[] args) {

            List<StreamDemo> al = new ArrayList<>();
            StreamDemo obj1 = new StreamDemo("nepal","kathmandu");
            StreamDemo obj2 = new StreamDemo("nepal","pokhara");
            StreamDemo obj3 = new StreamDemo("India","delhi");
            StreamDemo obj4 = new StreamDemo("usa","newyork");
            al.add(obj1);
            al.add(obj2);
            al.add(obj3);
            al.add(obj4);
        }
    }
