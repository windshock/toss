// entry=0x14ca10

void H14c414(long param_1,ulong param_2)

{
  bool bVar1;
  long lVar2;
  ulong uVar3;
  undefined **ppuVar4;
  ulong in_x9;
  ulong in_x13;
  long unaff_x19;
  long unaff_x22;
  long unaff_x24;
  long unaff_x26;
  ulong unaff_x28;
  ulong uVar5;
  
  uVar5 = (param_2 | unaff_x28) * 2 - (param_2 ^ unaff_x28);
  if (in_x13 != param_2) {
    do {
      *(undefined1 *)(unaff_x24 + uVar5) = *(undefined1 *)(*(long *)(unaff_x19 + 0x298) + in_x9);
      uVar5 = (uVar5 << 1 | 2) - (uVar5 ^ 1);
      lVar2 = (-*(long *)(unaff_x22 + 0x260) ^ 0x8032e68a143a5e89U) +
              (-*(long *)(unaff_x22 + 0x260) & 0x8032e68a143a5e89U) * 2;
      if (uVar5 < (unaff_x26 + 0x3ffU | -*(long *)(unaff_x22 + 0x260)) * 2 -
                  (unaff_x26 + 0x3ffU ^ -*(long *)(unaff_x22 + 0x260)) != lVar2 < (long)in_x9)
      break;
      uVar3 = ~*(ulong *)(unaff_x22 + 0x260) + 0x8032e68a143a5e89;
      bVar1 = lVar2 < (long)in_x9;
      in_x9 = (in_x9 ^ uVar3) + (in_x9 & uVar3) * 2;
    } while (bVar1);
  }
  ppuVar4 = &PTR_LAB_0027f178;
  if (uVar5 >= 0x400 ||
      (*(char *)((unaff_x26 - *(long *)(unaff_x22 + 0x260)) + param_1) != '\0') != uVar5 < 0x400) {
    ppuVar4 = &PTR_LAB_00278990;
  }
                    /* WARNING: Could not recover jumptable at 0x0024c630. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar4)();
  return;
}


