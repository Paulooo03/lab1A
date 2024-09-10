import java.lang.Math;
public class Main {
    public static void main(String[] args) {
       //logarithmic function

        long logstart = System.nanoTime();
        long secDuration = 1000000000L;
        long minDuration = 60000000000L;
        long hourDuration = 3600000000000L;

        //1 second
        for (double i = 1; ; i++){
            double log = Math.log(i);

            long seccurrentLog = System.nanoTime();
            if(seccurrentLog - logstart >= secDuration){
                System.out.println("1 second logarithm: " + log);
                break;
            }
        }
        //1 minute
        for (double j = 1; ; j++){
            double log = Math.log(j);
            long mincurrentLog = System.nanoTime();
            if(mincurrentLog - logstart >= minDuration){
                System.out.println("1 minute logarithm: " + log);
                break;
            }
        }
        //1 hour
        for (double k = 1; ; k++){
            double loghour = Math.log(k);
            long hourCurrentLog = System.nanoTime();
            if(hourCurrentLog - logstart >= hourDuration){
                System.out.println("1 hour logarithm: " + loghour);
                break;
            }
        }

        //n ^ 2
        long n2Start = System.nanoTime();
        //1 second
        for (long i = 1; ; i++){
            long n2 = i ^ 2;
            long secCurrentn2 = System.nanoTime();
            if(secCurrentn2 - n2Start >= secDuration){
                System.out.println("1 second n2: " + n2);
                break;
            }
        }
        //1 minute
        for (long j = 1; ; j++){
            long n2 = j ^ 2;
            long minCurrentn2 = System.nanoTime();
            if (minCurrentn2 - n2Start >= minDuration){
                System.out.println("1 minute n2: " + n2);
                break;
            }
        }

        //1 hour
        for (long k = 1; ; k++){
            long hourn2 = k ^ 2;
            long hourCurrentn2 = System.nanoTime();
            if(hourCurrentn2 - n2Start >= hourDuration){
                System.out.println("1 hour n2: " + hourn2);
                break;
            }
        }

        //n ^ 3
        long n3Start = System.nanoTime();
        //1 second
        for (long i = 1; ; i++){
            long n3 = i ^ 3;
            long secCurrentn3 = System.nanoTime();
            if(secCurrentn3 - n3Start >= secDuration){
                System.out.println("1 second n3: " + n3);
                break;
            }
        }

        //1 minute
        for (long j = 1; ; j++){
            long n3 = j ^ 3;
            long minCurrentn3 = System.nanoTime();
            if (minCurrentn3 - n3Start >= minDuration){
                System.out.println("1 minute n3: " + n3);
                break;
            }
        }

        //1 hour
        for (long k = 1; ; k++){
            long hourn3 = k ^ 3;
            long hourCurrentn3 = System.nanoTime();
            if(hourCurrentn3 - n3Start >= hourDuration){
                System.out.println("1 hour n3: " + hourn3);
                break;
            }
        }

        //square root function
        long sqrtStart = System.nanoTime();
        //1 second
        for (long i = 1; ; i++){
            long squareRoot = (long) Math.sqrt(i);
            long secCurrentsqrt = System.nanoTime();
            if(secCurrentsqrt - sqrtStart >= secDuration){
                System.out.println("1 second square root: " + squareRoot);
                break;
            }
        }

        //1 minute
        for (long j = 1; ; j++){
            long squareRootMin = (long) Math.sqrt(j);
            long minCurrentsqrt = System.nanoTime();
            if(minCurrentsqrt - sqrtStart >= minDuration){
                System.out.println("1 minute square root: " + squareRootMin);
                break;
            }
        }

        //1 hour
        for (long k = 1; ; k++){
            long hoursqrt = (long) Math.sqrt(k);
            long hourCurrentsqrt = System.nanoTime();
            if(hourCurrentsqrt - sqrtStart >= hourDuration){
                System.out.println("1 hour square root: " + hoursqrt);
                break;
            }
        }
    }
}