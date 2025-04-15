package Model;

import java.util.Date;

public class Gyankunj
{

        //	Declaring Overall Variables
        private int UserId, RecordId, BookId, RentalPeriod, PlaylistId;
        private String Title, Author, Genre, Description, UserName, Email, Password, UserType;
        private Date RentalDate, ReturnDate, DateAdded;
        private Boolean Availability;

        //	Constructor
        public Gyankunj(int userId, int recordId, int bookId, int rentalPeriod, int playlistId, String title, String author,
                        String genre, String description, String userName, String email, String password, String userType,
                        Date rentalDate, Date returnDate, Date dateAdded, Boolean availability)
        {
            this.UserId = userId;
            this.RecordId = recordId;
            this.BookId = bookId;
            this.RentalPeriod = rentalPeriod;
            this.PlaylistId = playlistId;
            this.Title = title;
            this.Author = author;
            this.Genre = genre;
            this.Description = description;
            this.UserName = userName;
            this.Email = email;
            this.Password = password;
            this.UserType = userType;
            this.RentalDate = rentalDate;
            this.ReturnDate = returnDate;
            this.DateAdded = dateAdded;
            this.Availability = availability;




        }

        //	Getter and Setter Methods
        public int getUserId() {
            return UserId;
        }

        public void setUserId(int userId) {
            UserId = userId;
        }

        public int getRecordId() {
            return RecordId;
        }

        public void setRecordId(int recordId) {
            RecordId = recordId;
        }

        public int getBookId() {
            return BookId;
        }

        public void setBookId(int bookId) {
            BookId = bookId;
        }

        public int getRentalPeriod() {
            return RentalPeriod;
        }

        public void setRentalPeriod(int rentalPeriod) {
            RentalPeriod = rentalPeriod;
        }

        public int getPlaylistId() {
            return PlaylistId;
        }

        public void setPlaylistId(int playlistId) {
            PlaylistId = playlistId;
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String title) {
            Title = title;
        }

        public String getAuthor() {
            return Author;
        }

        public void setAuthor(String author) {
            Author = author;
        }

        public String getGenre() {
            return Genre;
        }

        public void setGenre(String genre) {
            Genre = genre;
        }

        public String getDescription() {
            return Description;
        }

        public void setDescription(String description) {
            Description = description;
        }

        public String getUserName() {
            return UserName;
        }

        public void setUserName(String userName) {
            UserName = userName;
        }

        public String getEmail() {
            return Email;
        }

        public void setEmail(String email) {
            Email = email;
        }

        public String getPassword() {
            return Password;
        }

        public void setPassword(String password) {
            Password = password;
        }

        public String getUserType() {
            return UserType;
        }

        public void setUserType(String userType) {
            UserType = userType;
        }

        public Date getRentalDate() {
            return RentalDate;
        }

        public void setRentalDate(Date rentalDate) {
            RentalDate = rentalDate;
        }

        public Date getReturnDate() {
            return ReturnDate;
        }

        public void setReturnDate(Date returnDate) {
            ReturnDate = returnDate;
        }

        public Date getDateAdded() {
            return DateAdded;
        }

        public void setDateAdded(Date dateAdded) {
            DateAdded = dateAdded;
        }

        public Boolean getAvailability() {
            return Availability;
        }

        public void setAvailability(Boolean availability) {
            Availability = availability;
        }

}
