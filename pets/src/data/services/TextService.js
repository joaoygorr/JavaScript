export const TextService = {
  LimitText(text, sizeMax) {
    if (text.lenght < sizeMax) {
      return text;
    }
    return text.slice(0, sizeMax) + "...";
  },
};
