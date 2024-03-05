package es.iesmz;

public class EmpleadoBR {
    private static int salarioBase;
    private TipoEmpleado tipo;
    private float ventasMes;
    private float horasExtra;
    private float salarioBruto;

    public EmpleadoBR(int salarioBase, TipoEmpleado tipo, float ventasMes, float horasExtra, float salarioBruto) {
        this.salarioBase = salarioBase;
        this.tipo = tipo;
        this.ventasMes = ventasMes;
        this.horasExtra = horasExtra;
        this.salarioBruto = salarioBruto;
    }

    public static float calculaSalarioBruto(TipoEmpleado tipo, float ventasMes, float horasExtra) {
        if (tipo == TipoEmpleado.venedor) {
            salarioBase = 1000;
        } if (ventasMes >= 1000 && ventasMes < 1500) {
            salarioBase = 1100;
        } else if (ventasMes >= 1500) {
            salarioBase = 1200;
        }
        if (tipo == TipoEmpleado.encarregat) {
            salarioBase = 1500;
        } else if (tipo == TipoEmpleado.encarregat && ventasMes >= 1000 && ventasMes < 1500) {
            salarioBase = 1600;
        } else if (tipo == TipoEmpleado.encarregat && ventasMes >= 1500) {
            salarioBase = 1700;
        } else if (tipo == null) {
            return -1;
        }
        salarioBase += horasExtra * 20;

        return salarioBase;
    }



    public static float calculaSalarioNeto (float salarioBruto){
        if (salarioBruto >= 1000 && salarioBruto < 1500){
            salarioBruto -= salarioBruto * 0.16;
        }else if (salarioBruto>1500){
            salarioBruto -= salarioBruto * 0.18;
        }else{
            return -1;
        }
        float salarioNeto = salarioBruto;
        return salarioNeto;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public TipoEmpleado getTipo() {
        return tipo;
    }

    public void setTipo(TipoEmpleado tipo) {
        this.tipo = tipo;
    }

    public float getVentasMes() {
        return ventasMes;
    }

    public void setVentasMes(float ventasMes) {
        this.ventasMes = ventasMes;
    }

    public float getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(float horasExtra) {
        this.horasExtra = horasExtra;
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
}
