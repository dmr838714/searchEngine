package searchengine.parsers;

import searchengine.statistics.StatisticsLemma;
import searchengine.model.SitePage;

import java.util.List;

public interface LemmaParser {
    void run(SitePage site);
    List<StatisticsLemma> getLemmaDtoList();
}
