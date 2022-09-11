package role;

import object.Status;

public interface Trial {
    public void trial(Status status);

    public void requestForTestimony(Intermediary intermediary,Witness witness);
}
