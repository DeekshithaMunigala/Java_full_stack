export default function multiply(a, b) {
  return a * b;
}

export function divide(a, b) {
  if (b === 0) {
    return `number can't be divde by Zero`;
  } else {
    return a / b;
  }
}
