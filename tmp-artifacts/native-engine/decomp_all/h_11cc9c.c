// entry=0x11cc9c

void H11cc9c(void)

{
  ulong uVar1;
  uint *puVar2;
  undefined **ppuVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  long unaff_x19;
  ulong unaff_x20;
  ulong unaff_x22;
  uint unaff_w25;
  
  uVar1 = (*(ulong *)(unaff_x22 + 0x18) | unaff_x20) + (*(ulong *)(unaff_x22 + 0x18) & unaff_x20);
  **(ulong **)(unaff_x19 + 0x720) = uVar1;
  if (uVar1 <= unaff_x20) {
    CallSupervisor(0);
                    /* WARNING: Could not recover jumptable at 0x00219680. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00276440)();
    return;
  }
  **(undefined4 **)(unaff_x19 + 0x718) = (int)*(undefined8 *)(unaff_x22 + 0x20);
  **(undefined4 **)(unaff_x19 + 0x710) = (int)*(undefined8 *)(unaff_x22 + 0x38);
  *(int *)(unaff_x19 + 0x1e0) =
       (int)(char)((-(char)DAT_00281e58 & 0x7fU | 0x43) << 1) -
       (int)(char)(-(char)DAT_00281e58 ^ 0x43);
  puVar2 = (uint *)((unaff_x22 | **(ushort **)(unaff_x19 + 0x250)) +
                   (unaff_x22 & **(ushort **)(unaff_x19 + 0x250)));
  uVar4 = -(int)DAT_00281e58;
  uVar4 = (uVar4 | 0xcc88cf43) * 2 - (uVar4 ^ 0xcc88cf43);
  if ((unaff_w25 | uVar4) + (unaff_w25 & uVar4) == *(int *)(unaff_x19 + 0x284)) {
    uVar4 = (*(uint *)(unaff_x19 + 0x1d4) | 1) & (*(uint *)(unaff_x19 + 0x1d4) & 1 ^ 1);
    uVar5 = (uint)((char)*(undefined4 *)(unaff_x19 + 0x1e0) == '\0');
    uVar5 = uVar5 & uVar4 | uVar5 ^ uVar4;
    uVar6 = (uint)((char)*(undefined4 *)(unaff_x19 + 0x1e4) == '\0');
    uVar4 = -(int)DAT_00281e58;
    ppuVar3 = &PTR_LAB_002782c8 + (long)(int)((uVar4 | 0xcc88cf42) + (uVar4 & 0xcc88cf42)) * 0x5b;
    if ((uVar6 & uVar5) == 0 && uVar6 == uVar5) {
      ppuVar3 = &PTR_LAB_0027b1b0;
    }
                    /* WARNING: Could not recover jumptable at 0x00211f40. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar3)();
    return;
  }
  uVar4 = *puVar2;
  if (((uVar4 == 0) && ((int)puVar2[1] < 0)) &&
     ((uint *)((*(ulong *)(puVar2 + 6) ^ unaff_x20) + (*(ulong *)(puVar2 + 6) & unaff_x20) * 2) <
      puVar2)) {
                    /* WARNING: Could not recover jumptable at 0x00215798. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*DAT_0027b168)();
    return;
  }
  ppuVar3 = &PTR_LAB_0027f510;
  if (*(ulong *)(unaff_x19 + 0x270) <=
      (*(ulong *)(unaff_x19 + 0x270) ^ (ulong)uVar4) +
      (*(ulong *)(unaff_x19 + 0x270) & (ulong)uVar4) * 2) {
    ppuVar3 = &PTR_LAB_00278c28;
  }
                    /* WARNING: Could not recover jumptable at 0x0022c960. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar3)();
  return;
}


