def main():
    print("Enter up to 5 items you need to buy:")

    shopping_list = []

    for i in range(5):
        item = input(f"Enter item {i+1}: ").strip()
        if item == "":
            break
        shopping_list.append(item)

    print("\n📝 Your Shopping List:")
    for idx, item in enumerate(shopping_list, start=1):
        print(f"{idx}. {item}")

    print(f"\n📦 Total items in list: {len(shopping_list)}")

    search_item = input("\n🔍 Enter an item to search for: ").strip()
    if search_item in shopping_list:
        print(f"✅ '{search_item}' is in your shopping list.")
    else:
        print(f"❌ '{search_item}' is NOT in your shopping list.")

if __name__ == "__main__":
    main()
