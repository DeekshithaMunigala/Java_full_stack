const image = document.getElementById("img");
const prevBtn = document.getElementById("prev");
const nextBtn = document.getElementById("next");

const images = [
  "https://gpullareddysweets.com/cdn/shop/files/ASSORTEDSWEETS_2_1.png?v=1728107757",
  "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSNd2b6yMePHFOB27ezpgS8200YnAKNRtmkVA&s",
  "https://www.murarisweets.com/cdn/shop/files/MotichoorLaddu3.png?v=1709528857&width=1946",
  "https://thumbs.dreamstime.com/b/colorful-indian-sweets-plate-assorted-vibrant-colors-including-pink-orange-hues-363530951.jpg",
  "https://images.indianexpress.com/2022/10/GettyImages-sweets-Diwali-1200.jpg",
];

let currentIndex = 0;
function showImage() {
  image.src = images[currentIndex];
}

function showNextImage() {
  currentIndex++;
  if (currentIndex >= images.length - 1) {
    currentIndex = 0;
  }
  showImage();
}

function showPrevImage() {
  currentIndex--;
  if (currentIndex <= 0) {
    currentIndex = images.length - 1;
  }

  showImage();
}

prevBtn.addEventListener("click", showPrevImage);
nextBtn.addEventListener("click", showNextImage);

showImage();
