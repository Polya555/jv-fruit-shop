package core.basesyntax.serviceimpl;

import core.basesyntax.ReportGenerator;
import core.basesyntax.Storage;

import java.util.Map;

public class ReportGeneratorImpl implements ReportGenerator {
    private final Storage storage;
    public ReportGeneratorImpl(Storage storage) {
        this.storage = storage;
    }

    @Override
    public String getReport() {
        StringBuilder report = new StringBuilder("fruit,quantity\n");
        for (Map.Entry<String, Integer> entry : storage.getAll().entrySet()) {
            report.append(entry.getKey())
                    .append(",")
                    .append(entry.getValue())
                    .append("\n");
        }
        return report.toString();
    }
}
