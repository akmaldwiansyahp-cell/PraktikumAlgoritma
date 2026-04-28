package Jobsheet9;

public class StackSurat20 {
    Surat20[] stack;
    int size;
    int top;

    StackSurat20(int size){
        this.size = size;
        stack = new Surat20[size];
        top = -1;
    }

    boolean isfull(){
        if (top == size - 1) {
            return true;
        }else{
            return false;
        }
    }

    boolean isEmpty(){
        if (top == -1) {
            return true;
        }else{
            return false;
        }
    }

    void push(Surat20 surat){
        if (!isfull()) {
            top++;
            stack[top] = surat;
        }else{
            System.out.println("Data Sudah Penuh!");
        }
    }

    Surat20 pop(){
        if (!isEmpty()) {
            Surat20 s = stack[top];
            top--;
            return s;
        }else{
            System.out.println("Tidak Terdapat Data");
            return null;
        }
    }

    boolean cariSurat(String namaSiswa){
        boolean isFound = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaSiswa)) {
                isFound = true;
            }
        }
        return isFound;
    }

    Surat20 LihatTerakhir(){
        if (!isEmpty()) {
            return stack[top];
        }else{
            System.out.println("Tidak Terdapat Data");
            return null;
        }
    }
}
