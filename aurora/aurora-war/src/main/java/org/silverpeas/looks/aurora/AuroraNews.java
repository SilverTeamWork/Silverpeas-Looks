package org.silverpeas.looks.aurora;

import org.silverpeas.components.quickinfo.model.News;
import org.silverpeas.core.io.media.image.thumbnail.model.ThumbnailDetail;
import org.silverpeas.core.web.look.Shortcut;

import java.util.Date;

/**
 * Created by Nicolas on 19/07/2017.
 */
public class AuroraNews {

  private News news;
  private Shortcut appShortcut;

  public AuroraNews(News news) {
    this.news = news;
  }

  public String getTitle() {
    return news.getTitle();
  }

  public String getDescription() {
    return news.getDescription();
  }

  public Date getDate() {
    return news.getOnlineDate();
  }

  public String getPermalink() {
    return news.getPermalink();
  }

  public String getThumbnailURL() {
    ThumbnailDetail thumbnail = news.getPublication().getThumbnail();
    if (thumbnail == null) {
      return null;
    }
    return thumbnail.getURL();
  }

  public News getNews() {
    return news;
  }

  void setAppShortcut(Shortcut shortcut) {
    this.appShortcut = shortcut;
  }

  public Shortcut getAppShortcut() {
    return appShortcut;
  }
}