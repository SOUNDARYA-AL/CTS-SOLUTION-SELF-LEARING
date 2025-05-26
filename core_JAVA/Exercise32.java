Insert and Update Operations in JDBC:

PreparedStatement ps = c.prepareStatement("INSERT INTO students VALUES (?, ?)"); ps.setInt(1, 1); ps.setString(2, "John"); ps.executeUpdate();
