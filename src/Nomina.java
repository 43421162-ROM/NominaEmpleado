public class Nomina {
    // Campos
    private int clave;
    private String nombre;
    private int horasTrabajadas;
    private double pagoPorHora;

    // Constructor
    public Nomina(int clave, String nombre, int horasTrabajadas, double pagoPorHora) {
        this.clave = clave;
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    // MÉTODOS

    // Devuelve las horas que se van a considerar para el calculo
    // Se tarabajo mas de 50, solo se toman 50
    public int getHorasCalculadas()
    {
        if (horasTrabajadas > 50)
        {
            return 50;
        }
        else
        {
            return horasTrabajadas;
        }
    }

    // Calcula las horas normales
    // Maximo pueden ser de 40
    public int calcularHorasNormales()
    {
        int horas = getHorasCalculadas();

        if (horas <= 40)
        {
            return horas;
        }
        else
        {
            return 40;
        }
    }

    // Calcula las horas extras
    public int calcularHorasExtra()
    {
        int horas = getHorasCalculadas();

        if (horas > 40)
        {
            return horas - 40;
        }
        else
        {
            return 0;
        }
    }

    // Pago de las horas normales
    public double calcularPagoNormal()
    {
        return calcularHorasNormales() * pagoPorHora;
    }

    // Pago de horas extra
    // Cada hora extra vale el doble
    public double calcularPagoExtra()
    {
        return calcularHorasExtra() * pagoPorHora * 2;
    }

    // Pago total
    public double calcularPagoTotal()
    {
        return calcularPagoNormal() + calcularPagoExtra();
    }
}
