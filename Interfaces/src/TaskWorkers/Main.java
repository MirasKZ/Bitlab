package TaskWorkers;

public class Main {
    public static void main(String[] args){
        Staff s1=new Staff(12,"Miras","rbrtb",40000);
        Staff s2=new Staff(112,"Miras","rbrtb",42000);
        Staff s3=new Staff(123,"Miras","rbrtb",44000);
        Staff s4=new Staff(134,"Miras","rbrtb",45000);
        Staff s5=new Staff(142,"Miras","rbrtb",46000);
        HRManagers h1=new HRManagers(21,"fwfr erge",50000);
        HRManagers h2=new HRManagers(2451,"fwfr erge",52000);
        HRManagers h3=new HRManagers(2341,"fwfr erge",53000);
        HRManagers h4=new HRManagers(2341,"fwfr erge",54000);
        HRManagers h5=new HRManagers(2145,"fwfr erge",55000);
        Programmers p1=new Programmers(1245623,"Hulk", 63000,20000,0.6);
        Programmers p2=new Programmers(122533,"Hulk", 64000,20000,0.6);
        Programmers p3=new Programmers(122543,"Hulk", 65000,20000,0.6);
        Programmers p4=new Programmers(122563,"Hulk", 66000,20000,0.6);
        Programmers p5=new Programmers(122453,"Hulk", 67000,20000,0.6);
        Workers[] workers={s1,s2,s3,s4,s5,h1,h2,h3,h4,h5,p1,p2,p3,p4,p5};
        topSalary(workers);
        System.out.println("************");
        sortDecreasing(workers);
    }
    public static void topSalary(Workers[] workers){
            int max=workers[0].getSalary();
            int in=0;
            for (int i=1;i<workers.length;i++){
                if(workers[i].getSalary()>max){
                    max=workers[i].getSalary();
                    in=i;
                }
            }
            System.out.println("Top salary of "+ workers[in].getWorkerData()+" : "+max);
    }

    public static void sortDecreasing(Workers[] workers){
        for(int i=0; i<workers.length-1;i++){
            for(int j=i+1;j< workers.length;j++){
                if(workers[j].getSalary()>workers[i].getSalary()){
                    Workers newWorker=workers[i];
                    workers[i]=workers[j];
                    workers[j]=newWorker;
                }
            }
        }
        for(int i=0;i<workers.length;i++){
            System.out.println(workers[i].getWorkerData());
        }
    }

}
