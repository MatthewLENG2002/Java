public class Room {
    private String rid;
    private Library location;
    private int capacity;
    private boolean hasDisplay;
    private boolean hasWhiteboard;
    private String[] applicants;

    public Room(String rid) {
        this.rid = rid;
        this.location = Library.Lynn;
        this.capacity = 3;
        this.hasDisplay = true;
        this.hasWhiteboard = true;
        this.applicants = new String[14];
    }

    public Room(String rid, Library location, int capacity) {
        this.rid = rid;
        this.location = location;
        this.capacity = capacity;
        this.hasDisplay = true;
        this.hasWhiteboard = true;
        this.applicants = new String[14];
    }

    public Room(String rid, Library library, int capacity,
                boolean hasDisplay, boolean hasWhiteboard) {
        this.rid = rid;
        this.location = library;
        this.capacity = capacity;
        this.hasDisplay = hasDisplay;
        this.hasWhiteboard = hasWhiteboard;
        this.applicants = new String[14];
    }

    public String toString() {
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < applicants.length; i++) {
            i = getAppDetails(buffer, i);
        }
        return String.format("%s %s, capacity=%d, hasDisplay=%b, hasWhiteboard=%b\n" +
                "|08:00   |09:00   |10:00   |11:00   |12:00   |13:00   |14:00   |15:00   |16:00   |17:00   |18:00   |19:00   |20:00   |21:00   |\n" +
                "%s|\n", location, rid, capacity, hasDisplay, hasWhiteboard, buffer);
    }

    public String toString(int start, int end) {
        if (!(start >= 8 && end <= 22 && start < end)) return null;
        StringBuilder buffertime = new StringBuilder();
        StringBuilder bufferapplicant = new StringBuilder();
        for (int i = start - 8; i < end - 8; i++) {
            i = getAppDetails(bufferapplicant, i);
        }

        for (int i = start; i < end; i++) {
            if (i <= 9)
                buffertime.append("|0").append(i).append(":00   ");
            else
                buffertime.append("|").append(i).append(":00   ");
        }
        return String.format("%s %s, capacity=%d, hasDisplay=%b, hasWhiteboard=%b\n" +
                "%s|\n%s|\n", location, rid, capacity, hasDisplay, hasWhiteboard, buffertime, bufferapplicant);
    }

    private int getAppDetails(StringBuilder bufferapplicant, int i) {
        if (applicants[i] == null)
            bufferapplicant.append("|EMPTY   ");
        else if (i < applicants.length - 1 && applicants[i].equals(applicants[i + 1])) {
            bufferapplicant.append("|" + applicants[i] + "         ");
            i++;
        } else {
            bufferapplicant.append("|" + applicants[i]);
        }
        return i;
    }

    public boolean setApplicant(int start, int end, String SID, int numberOfTeammates) {
//        boolean isValid = true;
        if (start < 8 || end > 22 || (end - start) > 2 || !(numberOfTeammates <= (capacity - 1) && numberOfTeammates >= 0))
            return false;
        if (applicants[start - 8] != null || (end - start) == 2 && applicants[start - 7] != null)
            return false;
        for (int i = 0; i < 14; i++) {
            if (SID.equals(applicants[i])) {
                return false;
            }
        }
//        if (isValid) {
        if (end - start == 1) {
            applicants[start - 8] = SID;
        } else {
            applicants[start - 8] = SID;
            applicants[start - 7] = SID;
        }
//        }
        return true;
    }

    public boolean removeApplicant(String SID) {
        boolean isValid = false;
        if (SID == null)
            return false;
        for (int i = 0; i < 14; i++) {
            if (SID.equals(applicants[i])) {
                applicants[i] = null;
                isValid = true;
            }
        }
        return isValid;
    }
}
