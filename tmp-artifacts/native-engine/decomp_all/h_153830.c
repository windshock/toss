// entry=0x153830

void H153830(int param_1,undefined8 *param_2,undefined8 param_3,uint param_4,undefined8 param_5,
            undefined8 param_6,long param_7)

{
  undefined **ppuVar1;
  undefined8 *puVar2;
  int iVar3;
  ulong uVar4;
  ulong *puVar5;
  uint in_w13;
  ulong in_x14;
  ulong in_x15;
  long in_x16;
  long in_x17;
  ulong uVar6;
  long unaff_x22;
  long unaff_x25;
  uint uVar7;
  ulong unaff_x27;
  
  uVar4 = *(ulong *)(param_7 + unaff_x27 * in_x16 + 8);
  uVar6 = uVar4 >> 0x20;
  if (((uVar6 != (in_x15 | -*(long *)(unaff_x22 + 0x260)) + (in_x15 & -*(long *)(unaff_x22 + 0x260))
       ) && (iVar3 = (int)*(undefined8 *)(unaff_x22 + 0x260),
            uVar7 = (uint)*(byte *)(*(long *)(unaff_x25 + 0x60) + uVar6 * in_x16 + 4),
            (uVar7 & ((iVar3 * -2 | 0x30U) - (-iVar3 ^ param_4) ^ uVar7 ^ 0xffffffff)) == 2)) &&
     ((iVar3 = (int)uVar4, iVar3 - 0x401U < 2 || (iVar3 == 0x101)))) {
    puVar5 = (ulong *)(param_7 + unaff_x27 * in_x16);
    uVar6 = *puVar5;
    uVar4 = puVar5[2];
    uVar6 = (uVar6 | *(ulong *)(unaff_x25 + 0x68)) * 2 - (uVar6 ^ *(ulong *)(unaff_x25 + 0x68));
    ppuVar1 = (undefined **)&DAT_0027b988;
    if (*(long *)((uVar6 ^ uVar4) + (uVar6 & uVar4) * 2) !=
        (in_x15 ^ -*(long *)(unaff_x22 + 0x260)) + (in_x15 & -*(long *)(unaff_x22 + 0x260)) * 2) {
      ppuVar1 = &PTR_LAB_00280ed8;
    }
                    /* WARNING: Could not recover jumptable at 0x00251060. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)(*(undefined8 *)(unaff_x25 + 0x58));
    return;
  }
  uVar7 = -(int)*(undefined8 *)(unaff_x22 + 0x260);
  puVar2 = (undefined8 *)
           (in_x17 + (long)(int)((in_w13 | uVar7) * 2 - (in_w13 ^ uVar7)) * (long)param_1 + 0x300);
  if (in_x14 <= (unaff_x27 << 1 | 2) - (unaff_x27 ^ 1)) {
    puVar2 = param_2;
  }
                    /* WARNING: Could not recover jumptable at 0x0025382c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*puVar2)();
  return;
}


