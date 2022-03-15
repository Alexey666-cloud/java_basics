import java.text.DecimalFormat;
import java.util.Arrays;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {
        //TODO: напишите метод генерации массива температур пациентов
        float[] patientsTemp = new float[patientsCount];

        for (int i = 0; i < patientsTemp.length; i++) {
            patientsTemp[i] = Math.round(((float) (Math.random() * 8) + 32) * 10) / (float) 10.0;
        }
        return patientsTemp;
    }

    public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
        */

        int count = 0;

        for (int i = 0; i < temperatureData.length; i++) {
            if (temperatureData[i] >= 36.2F && temperatureData[i] <= 36.9F) {
                count++;
            }
        }

        float average;
        String result = "";

        if (temperatureData.length > 0) {
            float sum = 0;

            for (int i = 0; i < temperatureData.length; i++) {
                sum += temperatureData[i];
            }
            average = sum / temperatureData.length;
            DecimalFormat decimalFormat = new DecimalFormat("##.##");
            result = decimalFormat.format(average);
        }


        String report =
                "Температуры пациентов: " + Arrays.toString(temperatureData)
                        .replace(",", "")
                        .replace("[", "")
                        .replace("]", "") +
                        "\nСредняя температура: " + result
                        .replace(",", ".") +
                        "\nКоличество здоровых: " + count;

        return report;
    }
}
