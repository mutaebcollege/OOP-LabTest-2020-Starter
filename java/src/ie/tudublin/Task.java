package ie.tudublin;

import jdk.javadoc.internal.doclets.formats.html.markup.Table;
import processing.data.TableRow;

public class Task {

  private String task;
  private int start;
  private int end;

  public Task() {}

  public Task(String task, int start, int end) {
    this.task = task;
    this.start = start;
    this.end = end;
  }

  public Task(TableRow r) {
    this(r.getString("Task"), r.getInt("Start"), r.getInt("End"));
  }

  public String getTask() {
    return this.task;
  }

  public void setTask(String task) {
    this.task = task;
  }

  public int getStart() {
    return this.start;
  }

  public void setStart(int start) {
    this.start = start;
  }

  public int getEnd() {
    return this.end;
  }

  public void setEnd(int end) {
    this.end = end;
  }

  @Override
  public String toString() {
    return (
      "{" +
      " task='" +
      getTask() +
      "'" +
      ", start='" +
      getStart() +
      "'" +
      ", end='" +
      getEnd() +
      "'" +
      "}"
    );
  }
}
