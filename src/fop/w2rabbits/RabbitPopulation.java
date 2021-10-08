package fop.w2rabbits;

public class RabbitPopulation extends MiniJava {

    public static void main(String[] args){
int x=0,y=0,z=1;
int n=readInt();
int i=1;
while (i<=n)
{
    int sum=x+y+z;
    int sec=z;
    int fir=y;
    x=fir;
    y=sec;
    z=sum;
    i++;
}
write(z);
    }
}
